package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Traniee;
import com.example.demo.service.TranieeService;

@RestController
//@RequestMapping("/traniees")
public class TranieeController {
	
	@Autowired
	private TranieeService ts;
	
	@GetMapping("/")
	public ResponseEntity<String> hello()
	{
		return new ResponseEntity<String>(ts.data(),HttpStatus.OK);	
	}

	
	
	@PostMapping("/traniee") //insert the data to database
	public ResponseEntity<Traniee> saveTraniee(@RequestBody Traniee t) {
		System.out.print("hefghjkl");
		Traniee tk=ts.save(t);
		
		return new ResponseEntity<Traniee>(tk,HttpStatus.OK);
	}
	
	
	@PutMapping("/updateTraniee/{TarnieeId}")
	public ResponseEntity<Traniee> updateTraniee(@PathVariable("TranieeId") int id,@RequestBody Traniee t)
	{
		

	    if (ts.existsById(id)==false)
		{
	    	 return new ResponseEntity<Traniee>(HttpStatus.NOT_FOUND);

		}
	   ts.updateData(t);
	   
	    return new ResponseEntity<Traniee>(t,HttpStatus.OK);	
	}
	
	@GetMapping("/getTraniee/{TranieeId}")
    public ResponseEntity<Traniee> getTraniee
              (@PathVariable("TranieeId") int id) {
		
		if(ts.existsById(id)) {
			Traniee bk = ts.findById(id);
			return new ResponseEntity<Traniee>(bk,HttpStatus.OK);
		}
		return new ResponseEntity<Traniee>(HttpStatus.NOT_FOUND);
	}
	@DeleteMapping("/deleteTraniee/{TranieeId}")
    public ResponseEntity<Traniee> deleteTranieeId
              (@PathVariable("TranieeId") int id) {
		if(ts.existsById(id))
		{
			ts.deleteById(id);
		return new ResponseEntity<Traniee>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<Traniee>(HttpStatus.NOT_FOUND);
	}
	@GetMapping("/gettranieeDetails")
    public ResponseEntity<List<Traniee>> getAllTranieeDetails() {
			List<Traniee> tranieeList = ts.findAll();
			return new ResponseEntity<List<Traniee>>(tranieeList,
					HttpStatus.OK);
	}
	
}
