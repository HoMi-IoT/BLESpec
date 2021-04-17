package org.homi.plugin.BLEspec;
import org.homi.plugin.specification.*;
public enum BLESpec implements ISpecification{
	
	CONNECT(Boolean.class, String.class),
	DISCONNECT(Boolean.class, String.class),
	PAIR(Boolean.class, String.class),
	READ(Byte[].class, String.class, String.class, String.class),
	WRITE(Boolean.class, String.class, Byte[].class, String.class, String.class);
	
	
	Class<?> returnType;
	Class<?>[] params;

	
	
	BLESpec(Class<?> returnType, Class<?>... params){
		this.returnType = returnType;
		this.params = params;
	}

	@Override
	public Class<?>[] getParameterTypes() {
		
		return this.params;
	}

	@Override
	public Class<?> getReturnType() {
		
		return this.returnType;
	}
	

}
