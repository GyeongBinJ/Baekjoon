#include <iostream>
#include <set>

using namespace std;

int main()
{	
	int n;

	cin >> n;

	set<string> s;
	s.insert("ChongChong");
	string str, str2;

	while (n-- > 0) {
		cin >> str >> str2;

		if (s.find(str) != s.end() || s.find(str2) != s.end()) {
			s.insert(str);
			s.insert(str2);
		}
	}

	cout << s.size();

	return 0;
} 