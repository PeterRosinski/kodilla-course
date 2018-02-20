package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> theForumList = new ArrayList<ForumUser>();

    public Forum() {

        theForumList.add(new ForumUser(1,"user1",Sex.M, 1982,12,23,7));
        theForumList.add(new ForumUser(2,"user2",Sex.F, 2000,11,12,213));
        theForumList.add(new ForumUser(3,"user3",Sex.M, 1990,5,5,33));
        theForumList.add(new ForumUser(4,"user4",Sex.F, 1985,4,30,71));
        theForumList.add(new ForumUser(5,"user5",Sex.F, 1987,12,20,45));
        theForumList.add(new ForumUser(6,"user6",Sex.F, 1987,9,15,16));
        theForumList.add(new ForumUser(7,"user7",Sex.M, 1989,9,17,4));
        theForumList.add(new ForumUser(8,"user8",Sex.M, 2001,10,10,8));
        theForumList.add(new ForumUser(9,"user9",Sex.M, 1998,2,9,1));
        theForumList.add(new ForumUser(10,"user10",Sex.F, 1998,1,22,19));
        theForumList.add(new ForumUser(11,"user11",Sex.F, 1995,5,28,16));
        theForumList.add(new ForumUser(12,"user12",Sex.M, 1992,2,29,19));
        theForumList.add(new ForumUser(13,"user13",Sex.F, 1973,4,2,112));
        theForumList.add(new ForumUser(14,"user14",Sex.F, 1971,8,1,18));
        theForumList.add(new ForumUser(15,"user15",Sex.F, 1979,5,7,178));
        theForumList.add(new ForumUser(16,"user16",Sex.M, 1980,7,1,198));
        theForumList.add(new ForumUser(17,"user17",Sex.F, 1982,8,9,39));
        theForumList.add(new ForumUser(18,"user18",Sex.M, 1980,1,14,56));
        theForumList.add(new ForumUser(19,"user19",Sex.F, 1999,10,18,111));
        theForumList.add(new ForumUser(20,"user20",Sex.M, 1962,11,20,0));

    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(theForumList);
    }
}
