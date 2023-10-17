#include <iostream>
#include <algorithm>
#include <vector>

using namespace std;

int main()
{
	ios_base::sync_with_stdio(false);

	vector<int> vec;
	int num;

	for (int i = 0; i < 10; i++) {
		cin >> num;
		vec.push_back(num % 42);
	}

	sort(vec.begin(), vec.end());
	vec.erase(unique(vec.begin(), vec.end()), vec.end());

	cout << vec.size();

	return 0;
}