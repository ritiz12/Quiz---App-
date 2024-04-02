package quizappspring_V1.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import quizappspring_V1.example.demo.Question;

@Repository
public interface  QuestionDao extends JpaRepository<Question,Integer> {

}
