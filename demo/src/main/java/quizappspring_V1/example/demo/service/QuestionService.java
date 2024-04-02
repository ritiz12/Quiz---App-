package quizappspring_V1.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import quizappspring_V1.example.demo.Question;
import quizappspring_V1.example.demo.dao.QuestionDao;

import java.util.List;

@Service
public class QuestionService {
    @Autowired
    QuestionDao questionDao;
    public List<Question> getAllQuestions() {
       return questionDao.findAll();
    }
}
