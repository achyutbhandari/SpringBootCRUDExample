/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylibrary.entity;

import java.util.Date;




/**
 *
 * @author Bhandari
 */
public class BookIssueModel {
    private Integer id ;
    private MemberModel memberid ;
    private Book   bookid ;
    private Date bookissue ;
    private Date bookreturn ;
    private Float fine ;
    private LoginModel systemuserid ;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public MemberModel getMemberid() {
        return memberid;
    }

    public void setMemberid(MemberModel memberid) {
        this.memberid = memberid;
    }

    public Book getBookid() {
        return bookid;
    }

    public void setBookid(Book bookid) {
        this.bookid = bookid;
    }

    public Date getBookissue() {
        return bookissue;
    }

    public void setBookissue(Date bookissue) {
        this.bookissue = bookissue;
    }

    public Date getBookreturn() {
        return bookreturn;
    }

    public void setBookreturn(Date bookreturn) {
        this.bookreturn = bookreturn;
    }

    public Float getFine() {
        return fine;
    }

    public void setFine(Float fine) {
        this.fine = fine;
    }

    public LoginModel getSystemuserid() {
        return systemuserid;
    }

    public void setSystemuserid(LoginModel systemuserid) {
        this.systemuserid = systemuserid;
    }

    

   
    
}
