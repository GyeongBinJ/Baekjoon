#include <iostream>
#include <map>
#include <string>

using namespace std;

int main()
{	
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	map<string, int> pokemon;
	string name[100001];
	int m, n;

	cin >> m >> n;

	string value;

	for (int i = 1; i <= m; i++) {
		cin >> value;

		pokemon.insert({ value, i });
		name[i] = value;
	}

	
	for (int i = 1; i <= n; i++) {
		cin >> value;

		if (isdigit(value[0])) {
			cout << name[stoi(value)] << "\n";
		}
		else {
			cout << pokemon.find(value)->second << "\n";
		}
	}

	return 0;
}