package Model.Database.Repository;

import Model.Database.Account.Account;

public class Comment {
    enum CommentStat {
        WAITING, CONFIRMED, NOT_CONFIRMED;
    }
    private Account commenter;
    private Product product;
    private CommentStat stat;
    private boolean isCommenterBuyer;
    private String commentText;

}
