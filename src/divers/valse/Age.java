package divers.valse;

public class Age {

	public static void main(String[] args) {
		int ageHumain = 0;
		for(int ageElfe = 0; ageElfe < 400; ++ageElfe){
			if(ageElfe < 12 && ageElfe%2 == 1){
				ageHumain = ageHumain + 1;
			}else if(ageElfe >=14 && ageElfe <=19){
				if(ageElfe%2 == 0){
					ageHumain = ageHumain + 2;
				}else{
					ageHumain = ageHumain + 1;
				}
			}else if(ageElfe >19 && ageElfe <=50 && ageElfe%3 == 2){
				ageHumain = ageHumain + 1;
			}else if(ageElfe >50 && ageElfe%5 == 3){
				ageHumain = ageHumain + 1;
			}
			System.out.println("Age elfe : " + ageElfe + "\t ; Age humain : " + ageHumain);
		}

	}
}
