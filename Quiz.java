public class Quiz {

    private int id, maxScore, totalScore;
    private Student student;

    public Quiz (int id, Student student, int maxScore, int totalScore) {
        this.id = id;
        this.student = student;
        this.maxScore = maxScore;
        this.totalScore = totalScore;
    }

    public int getId(){

        return id;
    }

    public void setId(int id){

        this.id = id;
    }

    public int getMaxScore(){

        return maxScore;
    }

    public void setMaxScore(int maxScore){

        this.maxScore = maxScore;
    }

    public int getTotalScore(){

        return totalScore;
    }

    public void setTotalScore(int totalScore){

        this.totalScore = totalScore;
    }

    public double grade() {
        //I  multiplied it by 100 since the data type is double
        //but the totalScore and maxScore data type is int
        //When I tried to divide the totalScore by maxScore
        //let's say the totalScore a student got is 89 and the
        //maxScore a student can get is 100, 89/100 is 0.89
        //so I multiplied it by 100 so the result can be 89.
        return totalScore * 100 / maxScore;
    }





}
