package cn.zhuoqianmingyue.ioc.di.annotation;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("userAnnotation")
public class UserAnnotation {
	private static Logger log = LoggerFactory.getLogger(UserAnnotation.class);
	@Value(value = "zhuoqianmingyue2")
	private String name;
	@Value(value = "19")
	private Integer age;
	@Resource(name="countryAnnotation")
	private CountryAnnotation countryAnnotation;
	@Autowired
	private List<String> addressList; //= new ArrayList<String>() {{add("A");add("B");}};
	@Autowired
	private List<AddressAnnotation> addressClassList;
	@Autowired
	private Set<String> addressSet;
	@Autowired
	private Set<AddressAnnotation> addressClassSet;

	
	@Autowired
	private Map<String,AddressAnnotation> addressClassMap;
	

	public Map<String, AddressAnnotation> getAddressClassMap() {
		return addressClassMap;
	}
	public void setAddressClassMap(Map<String, AddressAnnotation> addressClassMap) {
		this.addressClassMap = addressClassMap;
	}
	public Set<AddressAnnotation> getAddressClassSet() {
		return addressClassSet;
	}
	public void setAddressClassSet(Set<AddressAnnotation> addressClassSet) {
		this.addressClassSet = addressClassSet;
	}
	public Set<String> getAddressSet() {
		return addressSet;
	}
	public void setAddressSet(Set<String> addressSet) {
		this.addressSet = addressSet;
	}
	public List<String> getAddressList() {
		return addressList;
	}
	public void setAddressList(List<String> addressList) {
		this.addressList = addressList;
	}
	public CountryAnnotation getCountryAnnotation() {
		return countryAnnotation;
	}
	public void setCountryAnnotation(CountryAnnotation countryAnnotation) {
		this.countryAnnotation = countryAnnotation;
	}

	
	public List<AddressAnnotation> getAddressClassList() {
		return addressClassList;
	}
	public void setAddressClassList(List<AddressAnnotation> addressClassList) {
		this.addressClassList = addressClassList;
	}
	/*public Set<String> getAddress2() {
		return address2;
	}
	public void setAddress2(Set<String> address2) {
		this.address2 = address2;
	}
	public Set<AddressAnnotation> getAddress2Class() {
		return address2Class;
	}
	public void setAddress2Class(Set<AddressAnnotation> address2Class) {
		this.address2Class = address2Class;
	}

	public Map<String, AddressAnnotation> getAddressClassMap() {
		return addressClassMap;
	}
	public void setAddressClassMap(Map<String, AddressAnnotation> addressClassMap) {
		this.addressClassMap = addressClassMap;
	}*/
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public void showUserInfo() {
		log.info("name:"+name+" age:"+age);
	}
}
