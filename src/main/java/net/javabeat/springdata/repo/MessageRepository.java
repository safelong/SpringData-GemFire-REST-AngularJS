package net.javabeat.springdata.repo;

import net.javabeat.springdata.data.Message;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="messages",path="messages")
public interface MessageRepository extends CrudRepository<Message,Integer> {}
