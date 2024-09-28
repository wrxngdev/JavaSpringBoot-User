package de.niko.vorlesung.repository;

import de.niko.vorlesung.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
