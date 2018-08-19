package kazusato.monolith.api

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.SerializationFeature
import com.fasterxml.jackson.datatype.jsr310.JSR310Module
import javax.ws.rs.ext.ContextResolver
import javax.ws.rs.ext.Provider

@Provider
class ObjectMapperContextResolver : ContextResolver<ObjectMapper> {

    val MAPPER = ObjectMapper()

    constructor() {
        MAPPER.registerModule(JSR310Module())
        MAPPER.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false)
    }

    override fun getContext(type: Class<*>?): ObjectMapper {
        return MAPPER
    }

}