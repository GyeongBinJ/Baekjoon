#include <iostream>
#include <string>

using namespace std;

int main()
{	
	int n;
	cin >> n;

	int i = 666;
	int cnt = 1;

	string str;

	while (n != cnt) {
		i++;

		str = to_string(i);
		if (str.find("666") != string::npos)
			cnt++;
	}

	cout << i;

	return 0;
}