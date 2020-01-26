package SixLesson;

public class Animal {
    float runRestriction;
    float jumpRestriction;
    float swimRestriction;

    Animal(float runRestriction, float jumpRestriction, float swimRestriction) {
        this.runRestriction = runRestriction;
        this.jumpRestriction = jumpRestriction;
        this.swimRestriction = swimRestriction;
    }

    boolean run(float distance){
        return distance < runRestriction;
    };

    boolean jump(float height){
        return height < jumpRestriction;
    };

    boolean swim(float interval){
        return interval < swimRestriction;
    };
}
