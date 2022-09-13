package springboot.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class ResourceNotFoundException {
 private String resourceName;
 private String feildName;
 private Object feildValue;
public ResourceNotFoundException(String resourceName, String feildName, Object feildValue) {
	super();
	this.resourceName = resourceName;
	this.feildName = feildName;
	this.feildValue = feildValue;
}
public String getResourceName() {
	return resourceName;
}
public String getFeildName() {
	return feildName;
}
public Object getFeildValue() {
	return feildValue;
}
}
