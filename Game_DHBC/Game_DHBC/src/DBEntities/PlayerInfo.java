/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBEntities;

import java.sql.Date;
import java.util.Vector;

/**
 *
 * @author ThienKim
 */
public class PlayerInfo {
    public String Name, Password, Avatar, Email, Phone, DOB;
    public int PlayerGem, PlayerScore, quesId;
    public Date PlayedDate;

    public PlayerInfo() {
    }

    public PlayerInfo(String Name, String Password, String Avatar, String Email, String Phone, String DOB, int PlayerGem, int PlayerScore, int quesId, Date PlayedDate) {
        this.Name = Name;
        this.Password = Password;
        this.Avatar = Avatar;
        this.Email = Email;
        this.Phone = Phone;
        this.DOB = DOB;
        this.PlayerGem = PlayerGem;
        this.PlayerScore = PlayerScore;
        this.quesId = quesId;
        this.PlayedDate = PlayedDate;
    }

    

    
    
    public Vector toVector(){
        Vector v = new Vector();
        v.add(Name);
        v.add(Password);
        v.add(Avatar);
        v.add(Email);
        v.add(Phone);
        v.add(DOB);
        v.add(PlayerGem);
        v.add(PlayerScore);
        v.add(quesId);
        v.add(PlayedDate);
       return v;
    }
    
    public String getEmail(){
        return Email;
    }
    
    public String getName(){
        return Name;
    }
    
    public String getPhone(){
        return Phone;
    }
    
    public String getDOB(){
        return DOB;
    }
    
    public String getAvt(){
        return Avatar;
    }
    
    public String getPassword(){
        return Password;
    }
    
    public int getPlayerGem(){
        return PlayerGem;
    }
    
    public int getPlayerScore(){
        return PlayerScore;
    }
    
    public int getquesId(){
        return quesId;
    }
    
    public Date getPlayedDate(){
        return PlayedDate;
    }
    
    public void setName(String Name){
        this.Name = Name;
    }
    
    public void setAvt(String Avatar){
        this.Avatar = Avatar;
    }
    
    public void setEmail(String Email){
        this.Email = Email;
    }
    
    public void setDOB(String DOB){
        this.DOB = DOB;
    }
    
    public void setPhone(String Phone){
        this.Phone = Phone;
    }
    
    public void setPassword(String Password){
        this.Password = Password;
    }
    
    public void setPlayerGem(int PlayerGem){
        this.PlayerGem = PlayerGem;
    }
    
    public void setPlayerScore(int PlayerScore){
        this.PlayerScore = PlayerScore;
    }
    
    public void setquesId(int quesId){
        this.quesId = quesId;
    }
    
    public void setPlayedDate(Date PlayerDate){
        this.PlayedDate = PlayerDate;
    }
}
