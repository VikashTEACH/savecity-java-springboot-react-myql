package com.app.savecity.wastissue.service;

import java.util.List;

import com.app.savecity.error.EntityNotFoundException;
import com.app.savecity.wastissue.entity.WastEntity;


public interface WastService {

	List<WastEntity> findAllWastIssue() throws EntityNotFoundException;

	WastEntity findWastIssueById(Long id) throws EntityNotFoundException;

	WastEntity updateWastIssue(WastEntity wastEntity, Long id);

	WastEntity saveWastIssue(WastEntity wastEntity);

}
