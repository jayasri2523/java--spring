package com.jobiak.lombok;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/catalog")

public class Customer {
 @GetMapping("/mobile")

 public String showCatalog() {
  
  
  return new String("Samsung E2FH,Dual Camera,32 GB Memory,49,999,I got you");
 }
 @GetMapping("/intro")
 public String introduction() {
  return new String("This #1Manufacturer of Digital Mobile in Asia");
 }
	
 @GetMapping("/search/{modelId}")
 public String searchModel(@PathVariable(value="modelId")String modelId) {
  return new String(modelId+" is available only in Blue and Black can be delivered in 24 hours...");
 }
	
	
	
 @GetMapping("/search/{modelId}/brand/{brand}")
 public String searchModel(@PathVariable(value="modelId")String modelId,@PathVariable(value="brand")String brand) {
  return new String(modelId+brand+" currently not available...");
 }
     
}
