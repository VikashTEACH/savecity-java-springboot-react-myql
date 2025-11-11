package com.app.savecity.wastissue.serviceimp;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.savecity.error.EntityNotFoundException;
import com.app.savecity.wastissue.entity.WastEntity;
import com.app.savecity.wastissue.repository.WastRepository;
import com.app.savecity.wastissue.service.WastService;

@Service
public class WastServiceImpl implements WastService {

	@Autowired
	private WastRepository wastRepository;
	
	@Override
	public List<WastEntity> findAllWastIssue() throws EntityNotFoundException {
		List<WastEntity> entity=wastRepository.findAll();
		if(entity.isEmpty()) {
			throw new EntityNotFoundException("Any entity not present ");
		}
		return entity;
	}

	@Override
	public WastEntity findWastIssueById(Long id) throws EntityNotFoundException {
		Optional<WastEntity> found= wastRepository.findById(id);
		if(!found.isPresent()) {
			throw new EntityNotFoundException("There are no west present with this id !! please enter valid id ");
		}
		return found.get();
	}

	@Override
	public WastEntity updateWastIssue(WastEntity wastEntity, Long id) {
		WastEntity entity=wastRepository.findById(id).get();
		if(Objects.nonNull(wastEntity.getPriority())&&!"".equalsIgnoreCase(wastEntity.getPriority())) {
			entity.setPriority(wastEntity.getPriority());
		}
		if(Objects.nonNull(wastEntity.getQuantity())) {
			entity.setQuantity(wastEntity.getQuantity());
		}
		if(Objects.nonNull(wastEntity.getWastType())&&!"".equalsIgnoreCase(wastEntity.getWastType())) {
			entity.setWastType(wastEntity.getWastType());
		}
		if(Objects.nonNull(wastEntity.getAdditionalAdd())&&!"".equalsIgnoreCase(wastEntity.getAdditionalAdd())) {
			entity.setAdditionalAdd(wastEntity.getAdditionalAdd());
		}
		return wastRepository.save(entity);
	}

	@Override
	public WastEntity saveWastIssue(WastEntity wastEntity) {
		return wastRepository.save(wastEntity);
	}

}
