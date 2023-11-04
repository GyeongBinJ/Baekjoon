#include <iostream>
using namespace std;

int main()
{
	ios_base::sync_with_stdio(false);
	cout.tie(0);

	int king, queen, look, bishop, knight, pawns;

	cin >> king >> queen >> look >> bishop >> knight >> pawns;

	cout << 1 - king << " " << 1 - queen << " " << 2 - look << " "
		<< 2 - bishop << " " << 2 - knight << " " << 8 - pawns;

	return 0;
}