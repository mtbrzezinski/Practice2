package MentoringWithAhmed.Constructor;

public class babyTest {
    public static void main(String[] args) {


        Baby juniorAhmet = new Baby();
        juniorAhmet.name = "Ahley";
        juniorAhmet.gender = "boy";
        juniorAhmet.eyecolor = "brown";
        juniorAhmet.height = 1.4;
        juniorAhmet.weight = 15;
        juniorAhmet.brainCapacity = 100;
        System.out.println(juniorAhmet.name);
        System.out.println(juniorAhmet.gender);
        System.out.println(juniorAhmet.eyecolor);
        System.out.println(juniorAhmet.height);
        System.out.println(juniorAhmet.weight);
        System.out.println(juniorAhmet.brainCapacity);
        Baby seniorAhmet = new Baby("boy");
        System.out.println(seniorAhmet.gender);

        Baby twoArgument = new Baby("John", "boy");
        System.out.println(twoArgument.name + twoArgument.gender);

        Baby threeArgument = new Baby("John", "boy", 13.5);
        System.out.println(threeArgument.name + threeArgument.gender + threeArgument.height);

        Baby allArguments = new Baby("John", "boy", 13.5, 36, "blue", 10);
        System.out.println(allArguments.name);
        System.out.println(allArguments.gender);
        System.out.println(allArguments.height);
        System.out.println(allArguments.weight);
        System.out.println(allArguments.eyecolor);
        System.out.println(allArguments.brainCapacity);
    }

}

