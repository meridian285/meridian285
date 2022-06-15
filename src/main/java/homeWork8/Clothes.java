package homeWork8;

public class Clothes {
        private String color;
        private String size;
        private  String seasonClothes;

        public Clothes(String color, String size, String seasonClothes){
                this.color = color;
                this.size = size;
                this.seasonClothes = seasonClothes;
        }
        public Clothes(){}

        public Clothes(String size, String seasonClothes){
                this.size = size;
                this.seasonClothes = seasonClothes;
        }
        public void setColor(Colors color){
                this.color = color;
        }
        public String getColor(){
                return color;
        }
        public void setSeasonClothes(Season season){
                this.seasonClothes = seasonClothes;
        }
        public String getSeasonClothes(){
                return seasonClothes;
        }


}
