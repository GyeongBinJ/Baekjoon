#include <iostream>
#include <stack>

using namespace std;

string result(string str)
{
	stack<char> s;

	for (int i = 0; i < str.length(); i++) {
		if (str[i] == '(') {
			s.push(str[i]);
		}
		else if (s.empty()) {
			return "NO";
		}
		else {
			s.pop();
		}
	}

	if (s.empty()) {
		return "YES";
	}
	else {
		return "NO";
	}
}

int main()
{	
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	
	int t;
	cin >> t;

	string str;

	while (t-- > 0) {
		cin >> str;
		cout << result(str) << "\n";
	}

	return 0;
}