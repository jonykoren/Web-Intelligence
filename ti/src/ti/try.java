
I would use an ArrayList... like so...

ArrayList<String> questions = new ArrayList<String>();


/// in your loop...
while((line = reader.readLine()) != null){
  questions.add(line);
}





