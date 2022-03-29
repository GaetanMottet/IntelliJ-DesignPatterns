package CaffeineBaverage_Example;

public abstract class CaffeineBeverage {

    /*this final void prepareRecipe is the method that "gives name to this pattern". It means that this pattern
        is builded on the idea to have a principal and unique method shared by many objects with similar processes
    */
    final void prepareRecipe() {  //the final keyword means that this value cannot be modified
        boilWater();
        brew();
        pourInCup();
        addCondiments();

        //to manage the not mandatory "hook"
        if(customerWantsCondiments()) {
            addCondiments();
        }
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater(){
        System.out.println("Boiling water");
    }

    void pourInCup(){
        System.out.println("Pouring into cup");
    }

    boolean customerWantsCondiments() { /*We define a method with a (mostly) empty default implementation.
        this method just returns true and dowes nothing else
        This is a hook because the subclass can override this method BUT doesN'T have to
        */
        return true;
    }
}
