package org.wecancodeit.reviewssitefullstack.model;

import java.util.Set;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

public class Tag {

	@Id
	@GeneratedValue
	private Long id;
	private String name;

