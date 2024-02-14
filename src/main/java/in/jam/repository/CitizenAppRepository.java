package in.jam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.jam.entity.CitizenAppEntity;

public interface CitizenAppRepository extends JpaRepository<CitizenAppEntity,Integer>{

	CitizenAppEntity save(CitizenAppEntity entity);

	

}
