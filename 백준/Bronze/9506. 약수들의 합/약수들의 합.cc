#include <iostream>
#include <vector>
using namespace std;

int main()
{	
	int n;
	while (true) {
		cin >> n;

		if (n == -1) break;

		vector<int> vec;
		int sum = 0;

		for (int i = 1; i < n; i++) {
			if (n % i == 0) vec.push_back(i);
		}

		for (int i = 0; i < vec.size(); i++) {
			sum += vec[i];
		}

		if (sum != n) {
			cout << n << " is NOT perfect." << "\n";
		}
		else if (sum == n) {
			cout << n << " = ";
			for (int i = 0; i < vec.size(); i++) {
				cout << vec[i];
				if ((i + 1) != vec.size())
					cout << " + ";
			}
			cout << "\n";
		}
		
	}
	return 0;
}