#include<iostream>
#include<cstdlib>
int main()
{
	int n,odd =0,even =0;
	std::cin >> n;
	int* a;
	a = (int*)malloc(n * sizeof(int));
	for (int i = 0; i < n; i++)
	{
		std::cin >> *(a + i);
		if (*(a + i) % 2 == 0)
			even++;
		else
			odd++;
	}
	std::cout << odd << std::endl;
	std::cout << even;

	return 0;
}