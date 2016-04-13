package geoquiz.android.bignerdranch.com.geoquiz;

/**
 * Created by Влад on 30.03.2016.
 */
public class TrueFalse {
    private int mQuestion;
    private boolean mTrueQuestion;

    TrueFalse(int question, boolean trueQuestion) {
        mQuestion = question;
        mTrueQuestion = trueQuestion;
    }

    public int getQuestion() {
         return mQuestion;
    }

    public boolean isTrueQuestion() {
        return mTrueQuestion;
    }

    public void setQuestion (int question) {
        mQuestion = question;
    }

    public void setTrueQuestion (boolean trueQuestion) {
        mTrueQuestion = trueQuestion;
    }
}
