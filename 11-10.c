#include <stdio.h>

void main()
{
	FILE* wfp;
	int i, k;

	wfp = fopen("c:\\c_study\\data6.txt", "w");

	for(i = 2; i <10; i++)
	{
	       fprintf(wfp, " #��%d��# " , i);
	}

	fprintf(wfp, "\n\n");

	for(i = 1; i<10; i++)
	{
		for(k=2; k<10; k++)
		{
			fprintf(wfp, "%2dX%2d=%2d ", k, i, i*k);
		}
		fprintf(wfp, "\n");
	}
}	
