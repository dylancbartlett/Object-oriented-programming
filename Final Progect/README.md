# The worksheet

the project is basically a better version of my last progect. The only thing that stayed the same was the concept all the code had to be changed to make it work. The program is a GUI that is made to look like a worksheet so you can study.

I chose to do this project becase it is what I originally planned on when i made my first final progect. At that time i didnt have to skills to make it as good as i wanted to. 

All you need to run the program is the finalStuff file. Everything is there. To run the program you push run and then enter in the correct answers in the text fields. Make sure you press enter after you enter each word so that it actually enters.

This portion of code was really challenging and took a bunch of time. It took a bunch of emails back and forth with my teacher.

'''
TextField textField = new TextField();
			HBox hb = new HBox();
			Label label1 = new Label("Question 1");
			hb.getChildren().addAll(label1, textField);
			hb.setSpacing(10);
			word.getChildren().add(hb);
			Button button = new Button("Check");
			String q1 = "";
			textField.setOnAction(new EventHandler<ActionEvent>() { 
				public void handle(ActionEvent args) {
				//q1 = textField.getText();
				} 
				
			});
			textField.setOnAction(e ->  { 

			if (textField.getText().equalsIgnoreCase("How")) {

			increaseScore();

			}			

			else {

			System.out.println("wrong");

			}
			});
      '''
      
To test it you have to compare the word entered to the word that is in the if statment. To test use JUnit4.
      
The people who helped with this progect was Rocky who helped me a lot with the textfield part and jacob almedia helped me get started.
