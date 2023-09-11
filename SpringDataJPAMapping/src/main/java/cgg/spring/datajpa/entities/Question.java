//package cgg.spring.datajpa.entities;
//
//import java.util.List;
//
//import jakarta.persistence.CascadeType;
//import jakarta.persistence.Entity;
//import jakarta.persistence.FetchType;
//import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.JoinTable;
//import jakarta.persistence.ManyToMany;
//import jakarta.persistence.Table;
//import lombok.Data;
//
//@Data
//@Entity
//@Table(name = "jpa_question")
//public class Question {
//	@Id
//	private int questionId;
//	private String question;
//
////	@OneToOne(mappedBy="question",cascade=CascadeType.ALL)
////	private Answer answer;
//	@ManyToMany(mappedBy="question",cascade=CascadeType.ALL,fetch=FetchType.EAGER)
//	@JoinTable(name = "question_answer",
//            joinColumns = @JoinColumn(name = "question_id"),
//            inverseJoinColumns = @JoinColumn(name = "answer_id"))
//	private List<Answer> answer;
//}
