package com.example.travel.service;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.travel.model.User;
import com.example.travel.repo.UserRepo;

@Service
public class UserService {
@Autowired
UserRepo userRepo;
public User addUser(User user)
{
    return userRepo.save(user);
}

public List<User> getUsers()
{
    return userRepo.findAll();
}
public Optional<User> getUserById(Long userId)
{
    return userRepo.findById(userId);
}
public void deluser(Long userId)
{
    userRepo.deleteById(userId);
}
public User editUser(Long userId,User User)
{
    User UserAvail=userRepo.findById(userId).orElse(null);
    if(UserAvail!=null)
    {
        UserAvail.setUserName(User.getUserName());
        UserAvail.setEmailAddress(User.getEmailAddress());
        UserAvail.setTravelId(User.getTravelId());
        UserAvail.setGender(User.getGender());
        return userRepo.saveAndFlush(UserAvail);
    }
    else
    {
        return null;
    }
}
public List<User> sortBasedUponName(String field)
{
    return userRepo.findAll(Sort.by(Sort.Direction.ASC,field));
}
public Page<User> getToyWithPagination(int offset,int pageSize)
{
    return userRepo.findAll(PageRequest.of(offset,pageSize));
}



}