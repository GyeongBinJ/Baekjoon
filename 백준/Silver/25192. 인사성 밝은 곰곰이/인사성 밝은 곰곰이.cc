#include <iostream>
#include <set>

using namespace std;

int main()
{	
	int n, count = 0;

	cin >> n;

	set<string> s;
	string str;

	while (n-- > 0) {
		cin >> str;

		if (str == "ENTER") {
			count += s.size();
			s.clear();
			continue;
		}
		s.insert(str);
	}

	cout << count + s.size();

	return 0;
} 