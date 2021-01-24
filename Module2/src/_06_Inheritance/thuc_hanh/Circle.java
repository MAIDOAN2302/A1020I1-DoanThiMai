package _06_Inheritance.thuc_hanh;

    class Circle extends Shape {
        double radius;

        public Circle() {
            this.radius = 1.0;
        }
        public Circle(double radius) {
            this.radius = radius;
        }
        public Circle(String color, boolean filled, double radius) {
            super(color, filled);
            this.radius = radius;
        }

        public double getArea() {
            return this.radius * this.radius * Math.PI;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public double getPerimeter() {
            return 2 * this.radius * Math.PI;
        }

        public void setPerimeter() {
            this.radius = radius;
        }

        @Override
        public String toString() {
            return "A Circle with radius= "
                    + radius
                    + ", which is a subclass of "
                    + super.toString();
        }
    }

