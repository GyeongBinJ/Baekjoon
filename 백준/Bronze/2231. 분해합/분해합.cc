#include <iostream>
#include <string>

using namespace std;

int main()
{	
	string sNum;

	cin >> sNum;

	int numLen = sNum.length();
	int num = stoi(sNum);
	int result = 0;

	for (int i = (num - (numLen * 9)); i < num; i++) {
		int sum = 0;
		int number = i;

		while (number != 0) {
			sum += number % 10;
			number /= 10;
		}

		if (i + sum == num) {
			result = i;
			break;
		}
	}

	cout << result;

	return 0;
}