package mymoves.clefairy;

import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {

    public Swagger(double pow, double acc){

        super(Type.NORMAL, pow, acc);




    }

    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        Effect.confuse(p);



    }

    @Override
    protected  void applySelfEffects(Pokemon p){
        super.applySelfEffects(p);

        Effect e = new Effect().stat(Stat.ATTACK, 2);
        p.addEffect(e);

    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];
    }

}
