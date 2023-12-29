#include <iostream>
#include <algorithm>
#include <string>

using namespace std;

int main()
{	
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	string strNum;

	cin >> strNum;

	sort(strNum.begin(), strNum.end(), greater<char>());

	cout << strNum;

	return 0;
}