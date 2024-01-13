#include <iostream>
#include <algorithm>
#include <set>

using namespace std;

int main()
{	
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	set<string> set;
	string str;

	cin >> str;

	string s = "";

	for (int i = 0; i < str.length(); i++) {
		for (int j = i; j < str.length(); j++) {
			s += str[j];
			set.insert(s);
		}
		s = "";
	}

	cout << set.size();

	return 0;
}