package com.pradeep.eventmanagement.repos;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.pradeep.eventmanagement.entities.Organizer;

public interface OrganizerRepository extends PagingAndSortingRepository<Organizer, Long> {

}
