std::string get_planet_name(int id)
{ 
  std::string array[8] = {"Mercury","Venus","Earth","Mars","Jupiter","Saturn","Uranus","Neptune"}; 
  return array[id-1];
}