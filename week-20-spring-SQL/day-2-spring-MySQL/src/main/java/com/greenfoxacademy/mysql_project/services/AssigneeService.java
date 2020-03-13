package com.greenfoxacademy.mysql_project.services;

import com.greenfoxacademy.mysql_project.models.Assignee;
import com.greenfoxacademy.mysql_project.models.Todo;
import com.greenfoxacademy.mysql_project.repository.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AssigneeService {

    private AssigneeRepository assigneeRepository;

    @Autowired
    public AssigneeService(AssigneeRepository assigneeRepository){
        this.assigneeRepository = assigneeRepository;
    }

    public Iterable<Assignee> findAll(){
        return assigneeRepository.findAll();
    }

    public void delete(String email){
        assigneeRepository.deleteById(email);
    }

    public Assignee findAssigneeById(String email) {
        Optional<Assignee> optional = assigneeRepository.findById(email);
        if (optional.isPresent()){
            return optional.get();
        } else {
            return null;
        }
    }

    public void saveAssignee(Assignee assignee){
        assigneeRepository.save(assignee);
    }

//    public void addAssignee(String name, String email){
//        assigneeRepository.save(new Assignee(name, email));
//    }

    public List<Todo> getAssignedTodos(String email) {
        return findAssigneeById(email).getTodos();
    }

}
