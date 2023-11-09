#include <iostream>
#include <string>

using namespace std;

int main()
{
	ios_base::sync_with_stdio(false);
	cout.tie(0);

	double sum = 0, scoreSum = 0;

	string majorName, grade;
	double score;
	double res = 0;

	for (int i = 0; i < 20; i++) {
		cin >> majorName >> score >> grade;

		if (grade == "P") continue;

		scoreSum += score;
			
		if (grade == "F") continue;

		if (grade[0] == 'A') sum = 4;
		else if (grade[0] == 'B') sum = 3;
		else if (grade[0] == 'C') sum = 2;
		else sum = 1;

		if (grade[1] == '+') sum += 0.5;

		res += score * sum;

	}
	
	cout << res / scoreSum;

	return 0;
}