public static void main(String...args){ 

	int equal = 0;

	int[] nums = {1, 2, 3, 2, 1};

	ArrayList<Integer> check = new ArrayList<>();

	for(int j = 0; j < nums.length; j++){

	for(int i = 0; i < nums.length; i++){

	if  (nums[j] == nums[i])equal += 1;
 	 

	if(equal < 2)check.add(nums[j]);
}
}
	for(int i = 0; i < check.size(); i++){
	System.out.println(check.get(i));
	}

}

