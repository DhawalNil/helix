package com.infy.reducer.dataconverter;

import java.io.File;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class DataConverterImpl<T> implements DataConverter<T>  {
	
	private static ObjectMapper objectMapper = new ObjectMapper() ;
	
	private final Class<T> entityClass ; 
	
		
		public DataConverterImpl( Class<T> entityClass) {
			this.entityClass = entityClass ;
		}
		public DataConverterImpl() {
			this.entityClass = null ;
		}
	

	@Override
	public T jsonToJavaObject(String jsonData) throws Exception{
		return objectMapper.readValue(jsonData, entityClass ) ;	
	}
	
	@Override
	public String javaObjectToJson(Object object) throws Exception{
		objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File("src/main/resources/check.json"), object);
		return objectMapper.writeValueAsString(object) ;
	}
}
