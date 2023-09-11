package cgg.spring.datajpa;

import java.util.ArrayList;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cgg.spring.datajpa.dao.EmployeeRepository;
import cgg.spring.datajpa.dao.ProjectRepository;
import cgg.spring.datajpa.entities.Employee;
import cgg.spring.datajpa.entities.Project;

@SpringBootApplication
public class SpringDataJpaMappingApplication implements CommandLineRunner {

	private static final Logger logger = Logger.getLogger(SpringDataJpaMappingApplication.class.getName());

//	@Autowired
//	private QuestionRepository questionRepo;
//
//	@Autowired
//	private AnswerRepository answerRepo;
	
	@Autowired
	private EmployeeRepository empRepo;
	
	@Autowired
	private ProjectRepository projRepo;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaMappingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		
//		Employee e1 = new Employee();
//		e1.setEid(1);
//		e1.setEname("abc");
//		
//		Employee e2 = new Employee();
//		e2.setEid(2);
//		e2.setEname("def");
//		
//		Project p1 = new Project();
//		p1.setPid(3);
//		p1.setPname("proj1");
//		
//		Project p2 = new Project();
//		p2.setPid(4);
//		p2.setPname("proj2");
//		
//		
//		e1.getProjects().add(p1);
//		e1.getProjects().add(p2);
//		
//		e2.getProjects().add(p2);
//		
//		
//		
//		Employee s1 = empRepo.save(e1);
//		Employee s2 = empRepo.save(e2);
//		
//		
//		logger.info("Emp saved with id : " + s1.getEid()+s2.getEid());

		
		Employee emp = empRepo.findById(1).get();
		logger.info(emp.getProjects().size()+emp.getEname());
		
		
		
		
		

		
		
		
//		 creating question
//		Question q1 = new Question();
//
//		q1.setQuestionId(11);
//		q1.setQuestion("what is java?");
//
//		Question q2 = new Question();
//
//		q2.setQuestionId(12);
//		q2.setQuestion("java kya hei?");
//
//		// creating answer
//		Answer a1 = new Answer();
//		a1.setAnswerId(111);
//		a1.setAnswer("Java is a programming language");
//
//		Answer a2 = new Answer();
//		a2.setAnswerId(122);
//		a2.setAnswer("Java is a platform independent");
//
//		q1.getAnswer().add(a1);
//		q1.getAnswer().add(a2);
//		q2.getAnswer().add(a1);
//		q2.getAnswer().add(a2);
//
//		a1.getQuestion().add(q1);
//		a1.getQuestion().add(q2);
//		a2.getQuestion().add(q1);
//		a2.getQuestion().add(q2);
//
//		Question save = questionRepo.save(q1);
//		Question save1 = questionRepo.save(q2);
//
//		logger.info("Question saved with id : " + save.getQuestionId() + save1.getQuestionId());

//		Question question = questionRepo.findById(11).get();
//		logger.info(question.getQuestionId() + question.getQuestion()+question.getAnswer().size());
	}

}
