package Class_Object_example_Two;

/*ask for user Name, Age, Weight, Height. Store them in a separate class .
Calculate the persons BMI .
Formula =(kg)/(meter Square)
 */


 class BMIClass {

  private String name;
  private int age;

  public double getWeight() {
   return weight;
  }

  private double weight;

  public double getHeight() {
   return height;
  }

  private double height;
  public static  final double kilosPerPound=0.4535;
  private static final double metersPerInch=0.0254;

  public int getAge() {
   return age;
  }

  public String getName() {
   return name;
  }

  public BMIClass(String name,int age, double weight,double height){
   this.name = name;
   this.age = age;
   this.weight = weight;
   this.height = height;
  }
  public BMIClass(String name,double weight,double height){
   this(name,1,weight,height);
  }
  public double getBMI(){
   double kilosConversion=weight*kilosPerPound;
   double MetersConeversion=height*metersPerInch;
   double BMI=kilosConversion/(MetersConeversion*MetersConeversion);
   return BMI;
  }

  public String getStatus(){
   double bmi=getBMI();
   if(bmi<18.5)
    return "Underweight";
   if(bmi<25)
    return "Normal";
   if(bmi<30)
    return "Overweight";
   else
    return "Obese";
  }
 }
