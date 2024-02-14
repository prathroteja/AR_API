package in.jam.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import in.jam.binding.CitizenApp;
import in.jam.entity.CitizenAppEntity;
import in.jam.repository.CitizenAppRepository;

@Service
public class ArServiceImpl implements ArService {
	

	@Autowired
	private CitizenAppRepository appRepo;
	
	@Override
	public Integer createApplication(CitizenApp app) {

		String endpointUrl = "https://ssa-web-api.herokuapp.com/ssn/{ssn}";
		
		RestTemplate rt = new RestTemplate();
				
	ResponseEntity<String> resEntity=rt.getForEntity(endpointUrl,String.class,app.getSsn());
		String stateName = resEntity.getBody();
		if("New Jersy".equals(stateName))
		{
			
			
			CitizenAppEntity entity = new CitizenAppEntity();
			
			BeanUtils.copyProperties(app,entity);
			entity.setStateName(stateName);
			CitizenAppEntity save=appRepo.save(entity);
			return save.getAppId();
			
		}
		
		
				
				return 0;
		
	}


}
