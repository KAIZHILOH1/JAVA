
class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

	void init(){
  
		System.out.println("Student is Graduating")
			System.out.println("Student is NOT Graduating")


  }

 double gpa(int gpaValue){
	if(gpaValue>=90){
		return gpaValue * 1.1;
	}
	else{
		return gpaValue;
	}
 }
  
String isGraduating(int gradeLevel && double credits){
	if(gradeLevel == senior && credits>=44){
		return "TRUE";
	}
	else{
		return "FALSE";
	}
}
double bmi(int weight && int height){
	double bmi = (weight / (height * height)) * 703;
	  if(bmi<=18.4){
    return "underweight";
    }
    else if (bmi>=18.5 && bmi<=24.9){
      return "Normal";
    }
	else if (bmi>=25.0 && bmi<=39.9){
      return "Overweight";
    }
    else (bmi>=40.0){
      return "Obese"}
    }
}

double shippingCost(int weight){
	  if(weight<=10.0){
    return 0.00;
    }
    else if (weight>10 && weight<=15){
      return 5.00;
    }
	else if (weight>15 && weight<=25){
      return 10.00;
    }
    else (weight>25){
      return 10.00+.02 * (weight)}
}
}